package org.csystem.organizationapp.dal;

import org.csystem.organizationapp.dao.ParticipiantDao;
import org.csystem.organizationapp.entity.ParticipiantInfo;

public enum  ParticipiantAppDAL {
    INSTANCE;
    public boolean insertParticipiant(ParticipiantInfo pi)
    {
        try {

        }
        catch (Throwable ex) {
            throw new DalException();
        }
    }
}
