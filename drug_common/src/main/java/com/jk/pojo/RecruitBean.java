package com.jk.pojo;

public class RecruitBean {

    private Integral id;
    private String  recruitPicture;
    private String recruitType;
    private String details;

    private   String recruitimg;
    private  String recruitName;

    public RecruitBean() {
    }


    public Integral getId() {
        return this.id;
    }

    public String getRecruitPicture() {
        return this.recruitPicture;
    }

    public String getRecruitType() {
        return this.recruitType;
    }

    public String getDetails() {
        return this.details;
    }

    public String getRecruitimg() {
        return this.recruitimg;
    }

    public String getRecruitName() {
        return this.recruitName;
    }

    public void setId(Integral id) {
        this.id = id;
    }

    public void setRecruitPicture(String recruitPicture) {
        this.recruitPicture = recruitPicture;
    }

    public void setRecruitType(String recruitType) {
        this.recruitType = recruitType;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setRecruitimg(String recruitimg) {
        this.recruitimg = recruitimg;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RecruitBean)) return false;
        final RecruitBean other = (RecruitBean) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$recruitPicture = this.getRecruitPicture();
        final Object other$recruitPicture = other.getRecruitPicture();
        if (this$recruitPicture == null ? other$recruitPicture != null : !this$recruitPicture.equals(other$recruitPicture))
            return false;
        final Object this$recruitType = this.getRecruitType();
        final Object other$recruitType = other.getRecruitType();
        if (this$recruitType == null ? other$recruitType != null : !this$recruitType.equals(other$recruitType))
            return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        final Object this$recruitimg = this.getRecruitimg();
        final Object other$recruitimg = other.getRecruitimg();
        if (this$recruitimg == null ? other$recruitimg != null : !this$recruitimg.equals(other$recruitimg))
            return false;
        final Object this$recruitName = this.getRecruitName();
        final Object other$recruitName = other.getRecruitName();
        if (this$recruitName == null ? other$recruitName != null : !this$recruitName.equals(other$recruitName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RecruitBean;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $recruitPicture = this.getRecruitPicture();
        result = result * PRIME + ($recruitPicture == null ? 43 : $recruitPicture.hashCode());
        final Object $recruitType = this.getRecruitType();
        result = result * PRIME + ($recruitType == null ? 43 : $recruitType.hashCode());
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        final Object $recruitimg = this.getRecruitimg();
        result = result * PRIME + ($recruitimg == null ? 43 : $recruitimg.hashCode());
        final Object $recruitName = this.getRecruitName();
        result = result * PRIME + ($recruitName == null ? 43 : $recruitName.hashCode());
        return result;
    }

    public String toString() {
        return "RecruitBean(id=" + this.getId() + ", recruitPicture=" + this.getRecruitPicture() + ", recruitType=" + this.getRecruitType() + ", details=" + this.getDetails() + ", recruitimg=" + this.getRecruitimg() + ", recruitName=" + this.getRecruitName() + ")";
    }
}
