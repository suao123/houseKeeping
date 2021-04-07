package cn.cyc.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;

    private Integer type;

    private Long starttime;

    private Long endtime;

    private Integer fee;

    private Long create;

    private Integer reserveid;

    private Integer serviceid;

    private Integer status;

    private Boolean deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getStarttime() {
        return starttime;
    }

    public void setStarttime(Long starttime) {
        this.starttime = starttime;
    }

    public Long getEndtime() {
        return endtime;
    }

    public void setEndtime(Long endtime) {
        this.endtime = endtime;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Long getCreate() {
        return create;
    }

    public void setCreate(Long create) {
        this.create = create;
    }

    public Integer getReserveid() {
        return reserveid;
    }

    public void setReserveid(Integer reserveid) {
        this.reserveid = reserveid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", fee=").append(fee);
        sb.append(", create=").append(create);
        sb.append(", reserveid=").append(reserveid);
        sb.append(", serviceid=").append(serviceid);
        sb.append(", status=").append(status);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}