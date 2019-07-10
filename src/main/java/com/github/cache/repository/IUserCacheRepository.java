package com.github.cache.repository;

import com.github.cache.pojo.UserCacheDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>
 * 创建时间为 18:54 2019-07-07
 * 项目名称 spring-boot-cache
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserCacheRepository extends PagingAndSortingRepository<UserCacheDO, String> {


    /**
     * 根据用户名查询单个用户
     *
     * @param name 用户名
     * @return UserCacheDO
     */
    UserCacheDO findUserCacheDOByNameIs(String name);


    UserCacheDO findUserCacheDOByPhoneEquals(String phone);


    /**
     * 删除单个用户
     *
     * @param name 用户名
     */
    void deleteUserCacheDOByNameIs(String name);

}