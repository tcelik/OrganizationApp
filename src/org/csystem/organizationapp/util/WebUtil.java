package org.csystem.organizationapp.util;

import org.csystem.organizationapp.entity.ParticipiantInfo;

import java.util.List;

public class WebUtil {
    //ver bana list ondan sana bir table html üreteyim

    public static String makeTableStr(List<ParticipiantInfo> list)
    {
        //Table tag
        String result = "<table>";

        //Header
        result += "<tr>";

        result += "<th>Name</th>";
        result += "<th>Email</th>";
        result += "<th>WillAttend</th>";
        result += "<th>RegisterTime</th>";
        result += "</tr>";

        //row
        for (ParticipiantInfo pi : list) {
            String fmt = "<td>%s</td><td>%s</td><td>%b</td><td>%s</td>";
            result += "<tr>";

            result += String.format(fmt, pi.getName(), pi.getEmail(), pi.willAttend(), pi.getRegisterTime());

            result += "</tr>";
        }

        return  result += "</table>";
    }
}
