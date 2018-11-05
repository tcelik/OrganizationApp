package org.csystem.organizationapp.form;

import org.csystem.organizationapp.dal.ParticipiantAppDAL;
import org.csystem.organizationapp.entity.ParticipiantInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class ParticipateFormHandler {
    private HttpServletRequest m_request;
    private HttpServletResponse m_response;

    //belki lazım olur.(Operation yazmıştım:))
    private ParticipiantInfo m_participiantInfo;

    private void validate(String name, String email)
    {
        if (name == null || email == null)
            throw new SecurityException();

    }

    private void printMessage() throws IOException
    {
        var fmt = "Sayın %s, <h3>%s</h3>";

        var msg = "";
        if (m_participiantInfo.willAttend())
            msg = "Katılımınız için teşekkür ederiz";
        else
            msg = "Kayıt için teşekkür ederiz. Daha sonraki organizasyonlarda bilgilendirileceksiniz";

        m_response.getWriter().print(String.format(fmt, m_participiantInfo.getName(), msg));
    }

    public ParticipateFormHandler(HttpServletRequest request, HttpServletResponse response)
    {
        m_request = request;
        m_response = response;
    }

    //post ile gelinen noktada
    public void doPost()
    {
        PrintWriter out = null;

        try {
            out = m_response.getWriter();
            var nameStr  = m_request.getParameter("name");
            var emailStr = m_request.getParameter("email");
            var willAttend = m_request.getParameter("willAttend") != null;

            validate(nameStr, emailStr); //security exception
            //fırlatmadyısa valid
            m_participiantInfo = new ParticipiantInfo(nameStr, emailStr, willAttend, LocalDateTime.now());
            //veritabanına ekleyelim
            ParticipiantAppDAL.INSTANCE.insertParticipiant(m_participiantInfo);

            //katılıp-katılmadığına yönelik mesaj
            printMessage();
        }
        catch (Throwable ex) {
            out.printf("<h2>Exception:%s</h2>", ex.getMessage());
        }

    }

    public HttpServletRequest getRequest()
    {
        return m_request;
    }

    public void setRequest(HttpServletRequest request)
    {
        m_request = request;
    }

    public HttpServletResponse getResponse()
    {
        return m_response;
    }

    public void setResponse(HttpServletResponse response)
    {
        m_response = response;
    }
}
