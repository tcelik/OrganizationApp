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
        return "";
    }


}
