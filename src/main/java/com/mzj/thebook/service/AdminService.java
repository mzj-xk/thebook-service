package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.AdminUser;

public interface AdminService {
    Result<?> login(AdminUser adminUser);
}
