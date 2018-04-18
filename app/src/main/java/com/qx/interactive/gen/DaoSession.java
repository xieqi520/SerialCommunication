package com.qx.interactive.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.qx.interactive.answer.model.Subject;

import com.qx.interactive.gen.SubjectDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig subjectDaoConfig;

    private final SubjectDao subjectDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        subjectDaoConfig = daoConfigMap.get(SubjectDao.class).clone();
        subjectDaoConfig.initIdentityScope(type);

        subjectDao = new SubjectDao(subjectDaoConfig, this);

        registerDao(Subject.class, subjectDao);
    }
    
    public void clear() {
        subjectDaoConfig.clearIdentityScope();
    }

    public SubjectDao getSubjectDao() {
        return subjectDao;
    }

}