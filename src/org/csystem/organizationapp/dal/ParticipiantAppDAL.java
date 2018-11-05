package org.csystem.organizationapp.dal;

import org.csystem.organizationapp.dao.ParticipiantDao;
import org.csystem.organizationapp.entity.ParticipiantInfo;
import org.cystem.dal.DalException;

public enum  ParticipiantAppDAL {

    //buradaki Instance Dal nesnesi aslında new yapılmış static olarak erişim ve final.(enum başlangıç methodu)
    INSTANCE;
    public boolean insertParticipiant(ParticipiantInfo pi)
    {
        try {
            return ParticipiantDao.INSTANCE.insert(pi);
        }
        catch (Throwable ex) {
            throw new DalException("insertParticipiantta bir hata var", ex);
        }
    }
}
