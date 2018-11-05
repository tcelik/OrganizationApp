package org.csystem.organizationapp.util;

import org.csystem.organizationapp.TableTag;
import org.csystem.organizationapp.entity.ParticipiantInfo;

import java.util.ArrayList;
import java.util.List;

public class WebUtil {
    //ver bana list ondan sana bir table html üreteyim
    private WebUtil() {}

    private static void addCommon(ParticipiantInfo pi, List<String> list)
    {
        list.add(pi.getName());
        list.add(pi.getEmail());
        list.add(pi.getRegisterTime().toString());
    }

    public static String makeTableStr(List<ParticipiantInfo> list)
    {
        TableTag tt = new TableTag();

        tt.addHead("Name");
        tt.addHead("Email");
        tt.addHead("Kayıt Tarihi");
        tt.addHead("Katılım Durumu");

        //bunu her bir katılımcı için yapıyorum aslında datalrında bir liste oluşturuyorum.
        for (ParticipiantInfo pi : list) {
            List<String> l = new ArrayList<>();

            addCommon(pi, l);

            l.add(pi.willAttend()?"katılıyor":"katılmıyor");

            tt.addData(l);
        }

        return tt.toString();
    }
}
