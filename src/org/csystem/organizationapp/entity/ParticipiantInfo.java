package org.csystem.organizationapp.entity;

import java.time.LocalDateTime;

public class ParticipiantInfo {
    private int m_id;
    private String m_name;
    private String m_email;
    private boolean m_willAttend;
    private LocalDateTime m_registerTime;

    //böyle de nesne oluştursun id vermeden
    public ParticipiantInfo(String name, String email, boolean willAttend, LocalDateTime registerTime)
    {
        this(0, name, email, willAttend, registerTime);
    }

    //isterse böyle de oluşturabilir.
    public ParticipiantInfo(int id, String name, String email, boolean willAttend, LocalDateTime registerTime)
    {
        m_id = id;
        m_name = name;
        m_email = email;
        m_willAttend = willAttend;
        m_registerTime = registerTime;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getEmail()
    {
        return m_email;
    }

    public void setEmail(String email)
    {
        m_email = email;
    }

    public boolean willAttend()
    {
        return m_willAttend;
    }

    public void setWillAttend(boolean willAttend)
    {
        m_willAttend = willAttend;
    }

    public LocalDateTime getRegisterTime()
    {
        return m_registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime)
    {
        m_registerTime = registerTime;
    }

    public String toString()
    {
        return String.format("%s - %s%n", m_name, m_email);
    }
}
