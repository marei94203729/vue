package com.cros.vue.entity;

import java.io.Serializable;

public class SlpriceadjWithBLOBs extends Slpriceadj implements Serializable {
    private String customerFilter;

    private String dimFilter;

    private String productFilter;

    private String pdtaliasFilter;

    private String sqlstatement;

    private String blockFilter;

    private String storeFilter;

    private static final long serialVersionUID = 1L;

    public String getCustomerFilter() {
        return customerFilter;
    }

    public void setCustomerFilter(String customerFilter) {
        this.customerFilter = customerFilter == null ? null : customerFilter.trim();
    }

    public String getDimFilter() {
        return dimFilter;
    }

    public void setDimFilter(String dimFilter) {
        this.dimFilter = dimFilter == null ? null : dimFilter.trim();
    }

    public String getProductFilter() {
        return productFilter;
    }

    public void setProductFilter(String productFilter) {
        this.productFilter = productFilter == null ? null : productFilter.trim();
    }

    public String getPdtaliasFilter() {
        return pdtaliasFilter;
    }

    public void setPdtaliasFilter(String pdtaliasFilter) {
        this.pdtaliasFilter = pdtaliasFilter == null ? null : pdtaliasFilter.trim();
    }

    public String getSqlstatement() {
        return sqlstatement;
    }

    public void setSqlstatement(String sqlstatement) {
        this.sqlstatement = sqlstatement == null ? null : sqlstatement.trim();
    }

    public String getBlockFilter() {
        return blockFilter;
    }

    public void setBlockFilter(String blockFilter) {
        this.blockFilter = blockFilter == null ? null : blockFilter.trim();
    }

    public String getStoreFilter() {
        return storeFilter;
    }

    public void setStoreFilter(String storeFilter) {
        this.storeFilter = storeFilter == null ? null : storeFilter.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerFilter=").append(customerFilter);
        sb.append(", dimFilter=").append(dimFilter);
        sb.append(", productFilter=").append(productFilter);
        sb.append(", pdtaliasFilter=").append(pdtaliasFilter);
        sb.append(", sqlstatement=").append(sqlstatement);
        sb.append(", blockFilter=").append(blockFilter);
        sb.append(", storeFilter=").append(storeFilter);
        sb.append("]");
        return sb.toString();
    }
}