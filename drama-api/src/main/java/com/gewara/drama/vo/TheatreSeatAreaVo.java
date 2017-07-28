/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.drama.vo;

import com.gewara.api.vo.BaseVo;
import java.io.Serializable;
import java.sql.Timestamp;
import org.apache.commons.lang.StringUtils;

public class TheatreSeatAreaVo extends BaseVo {
	private static final long serialVersionUID = -7924268455854109433L;
	private Long id;
	private Long dpid;
	private Long theatreid;
	private Long dramaid;
	private String areaname;
	private String enname;
	private String seller;
	private String sellerseq;
	private String fieldnum;
	private String roomnum;
	private String description;
	private String standing;
	private Integer total;
	private Integer limitnum;
	private Integer firstline;
	private Integer firstrank;
	private Integer linenum;
	private Integer ranknum;
	private String hotzone;
	private String mobilehotzone;
	private String status;
	private String seatmap;
	private Timestamp addtime;
	private Timestamp updatetime;
	private Integer gsellnum;
	private Integer csellnum;
	private Integer locknum;
	private Integer remainnum;
	private String svgpath;
	private String otherinfo;

	public Serializable realId() {
		return this.id;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDpid() {
		return this.dpid;
	}

	public void setDpid(Long dpid) {
		this.dpid = dpid;
	}

	public Long getTheatreid() {
		return this.theatreid;
	}

	public void setTheatreid(Long theatreid) {
		this.theatreid = theatreid;
	}

	public Long getDramaid() {
		return this.dramaid;
	}

	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}

	public String getAreaname() {
		return this.areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getEnname() {
		return this.enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getSeller() {
		return this.seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getSellerseq() {
		return this.sellerseq;
	}

	public void setSellerseq(String sellerseq) {
		this.sellerseq = sellerseq;
	}

	public String getFieldnum() {
		return this.fieldnum;
	}

	public void setFieldnum(String fieldnum) {
		this.fieldnum = fieldnum;
	}

	public String getRoomnum() {
		return this.roomnum;
	}

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStanding() {
		return this.standing;
	}

	public void setStanding(String standing) {
		this.standing = standing;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getLimitnum() {
		return this.limitnum;
	}

	public void setLimitnum(Integer limitnum) {
		this.limitnum = limitnum;
	}

	public Integer getFirstline() {
		return this.firstline;
	}

	public void setFirstline(Integer firstline) {
		this.firstline = firstline;
	}

	public Integer getFirstrank() {
		return this.firstrank;
	}

	public void setFirstrank(Integer firstrank) {
		this.firstrank = firstrank;
	}

	public Integer getLinenum() {
		return this.linenum;
	}

	public void setLinenum(Integer linenum) {
		this.linenum = linenum;
	}

	public Integer getRanknum() {
		return this.ranknum;
	}

	public void setRanknum(Integer ranknum) {
		this.ranknum = ranknum;
	}

	public String getHotzone() {
		return this.hotzone;
	}

	public void setHotzone(String hotzone) {
		this.hotzone = hotzone;
	}

	public String getMobilehotzone() {
		return this.mobilehotzone;
	}

	public void setMobilehotzone(String mobilehotzone) {
		this.mobilehotzone = mobilehotzone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeatmap() {
		return this.seatmap;
	}

	public void setSeatmap(String seatmap) {
		this.seatmap = seatmap;
	}

	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getGsellnum() {
		return this.gsellnum;
	}

	public void setGsellnum(Integer gsellnum) {
		this.gsellnum = gsellnum;
	}

	public Integer getCsellnum() {
		return this.csellnum;
	}

	public void setCsellnum(Integer csellnum) {
		this.csellnum = csellnum;
	}

	public Integer getLocknum() {
		return this.locknum;
	}

	public void setLocknum(Integer locknum) {
		this.locknum = locknum;
	}

	public String getOtherinfo() {
		return this.otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public boolean hasStatus(String stats) {
		return StringUtils.isBlank(stats) ? false : StringUtils.equals(this.status, stats);
	}

	public boolean hasSeller(String sell) {
		return StringUtils.isBlank(sell) ? false : StringUtils.equals(this.seller, sell);
	}

	public Integer getRemainnum() {
		return this.remainnum;
	}

	public void setRemainnum(Integer remainnum) {
		this.remainnum = remainnum;
	}

	public String getName() {
		return this.areaname;
	}

	public String getSvgpath() {
		return this.svgpath;
	}

	public void setSvgpath(String svgpath) {
		this.svgpath = svgpath;
	}
}