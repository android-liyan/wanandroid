package com.feiyang.wanandroid.core.net;

import com.feiyang.wanandroid.base.BaseResponse;
import com.feiyang.wanandroid.ui.login.model.bean.LoginData;
import com.feiyang.wanandroid.ui.main.model.bean.ArticlesData;
import com.feiyang.wanandroid.ui.main.model.bean.BannerData;
import com.feiyang.wanandroid.ui.main.model.bean.CollectionData;
import com.feiyang.wanandroid.ui.main.model.bean.HotWordsData;
import com.feiyang.wanandroid.ui.main.model.bean.KnowledgeHierarchyData;
import com.feiyang.wanandroid.ui.main.model.bean.NaviData;
import com.feiyang.wanandroid.ui.main.model.bean.ProjectCategoryData;
import com.feiyang.wanandroid.ui.main.model.bean.SiteData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Copyright:wanandroid2
 * Author: liyang <br>
 * Date:2018/11/21 3:15 PM<br>
 * Desc: <br>
 */
@SuppressWarnings("JavaDoc")
public interface ApiService {
    /**
     * 首页文章列表
     *
     * @param pageNo
     * @return
     */
    @GET("article/list/{pageNo}/json")
    Observable<BaseResponse<ArticlesData>> getArticleList(@Path("pageNo") int pageNo);

    /**
     * 首页banner
     *
     * @return
     */
    @GET("banner/json")
    Observable<BaseResponse<List<BannerData>>> getBannerList();

    /**
     * 常用网站
     *
     * @return
     */
    @GET("friend/json")
    Observable<BaseResponse<List<SiteData>>> getSiteList();

    /**
     * 搜索热词
     * 目前搜索最多的关键词。
     *
     * @return
     */
    @GET("hotkey/json")
    Observable<BaseResponse<List<HotWordsData>>> getHotWordsList();

    /**
     * 体系数据
     *
     * @return
     */
    @GET("tree/json")
    Observable<BaseResponse<List<KnowledgeHierarchyData>>> getKnowledgeHirarchyList();

    /**
     * 知识体系下的文章
     *
     * @param pageNo
     * @param cid    分类的id，上述二级目录的id
     * @return
     */
    @GET("article/list/{pageNo}/json")
    Observable<BaseResponse<ArticlesData>> getKnowledgeArticleList(@Path("pageNo") int pageNo, @Query("cid") int cid);

    /**
     * 导航数据
     *
     * @return
     */
    @GET("navi/json")
    Observable<BaseResponse<List<NaviData>>> getNaviList();

    /**
     * 项目为包含一个分类，该接口返回整个分类。
     *
     * @return
     */
    @GET("project/tree/json")
    Observable<BaseResponse<List<ProjectCategoryData>>> getProjectCateList();

    /**
     * http://www.wanandroid.com/project/list/1/json?cid=294
     * 某一个分类下项目列表数据，分页展示
     *
     * @param pageNo
     * @param cid    cid 分类的id，上面项目分类接口
     * @return
     */
    @GET("project/list/{pageNo}/json")
    Observable<BaseResponse<ArticlesData>> getProjectArticles(@Path("pageNo") int pageNo, @Query("cid") int cid);

    /**
     * 登录接口
     *
     * @param param
     * @return
     */
    @POST("user/login")
    Observable<BaseResponse<LoginData>> login(@Body LoginParam param);

    class LoginParam {
        public String username;

        public String password;

        public LoginParam(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public LoginParam() {
        }
    }

    /**
     * 注册接口
     *
     * @return
     */
    @POST("user/register")
    Observable<BaseResponse<LoginData>> regist(@Body RegistParam param);

    class RegistParam {
        public String username;

        public String password;

        public String repassword;

        public RegistParam() {
        }

        public RegistParam(String username, String password, String repassword) {
            this.username = username;
            this.password = password;
            this.repassword = repassword;
        }
    }

    /**
     * 退出
     *
     * @return
     */
    @GET("user/logout/json")
    Observable<BaseResponse<Object>> logout();

    /**
     * 获取收藏列表
     *
     * @param pageNo
     * @return
     */
    @GET("lg/collect/list/{pageNo}/json")
    Observable<BaseResponse<CollectionData>> getCollectionList(@Path("pageNo") int pageNo);


}
