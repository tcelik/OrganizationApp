package org.csystem.organizationapp;

import java.util.ArrayList;
import java.util.List;

public class TableTag {
    private List<String> m_heads = new ArrayList<>();
    private List<List<String>> m_data = new ArrayList<>();

    public boolean addHead(String head)
    {
        return m_heads.add(head);
    }

    public boolean addData(List<String> data)
    {
        return m_data.add(data);
    }

    public String toString()
    {
        String tagStr = "<table>";

        tagStr += "<tr>";
        for (var head : m_heads) {
            tagStr += String.format("<th>%s</th>", head);
        }
        tagStr += "</tr>";

        for (var data : m_data) {
            tagStr += "<tr>";
            for (var dataList : data)
                tagStr += String.format("<td>%s</td>", dataList);
            tagStr += "</tr>";
        }

        return tagStr + "</table>";
    }


}
