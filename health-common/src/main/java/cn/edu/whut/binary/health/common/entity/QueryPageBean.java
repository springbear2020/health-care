package cn.edu.whut.binary.health.common.entity;

import java.io.Serializable;

/**
 * @author Spring-_-Bear
 * @datetime 2022-07-16 17:00 Saturday
 */
public class QueryPageBean implements Serializable {
    private static final long serialVersionUID = 3906417761607595170L;

    /**
     * 当前页面
     */
    private Integer currentPage;
    /**
     * 每页的记录数
     */
    private Integer pageSize;
    /**
     * 查询条件
     */
    private String queryString;

    public QueryPageBean() {
    }

    public QueryPageBean(Integer currentPage, Integer pageSize, String queryString) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.queryString = queryString;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    @Override
    public String toString() {
        return "QueryPageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", queryString='" + queryString + '\'' +
                '}';
    }
}
