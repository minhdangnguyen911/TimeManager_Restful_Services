package com.nmdang.DTO;

import java.sql.Date;



public class Time_DTO {
	private int _timeId;
	private String _timeName;
	private Date _timeStart;
	private Date _timeEnd;
	
	public int get_timeId() {
		return _timeId;
	}
	public void set_timeId(int _timeId) {
		this._timeId = _timeId;
	}
	public String get_timeName() {
		return _timeName;
	}
	public void set_timeName(String _timeName) {
		this._timeName = _timeName;
	}
	public Date get_timeStart() {
		return _timeStart;
	}
	public void set_timeStart(Date _timeStart) {
		this._timeStart = _timeStart;
	}
	public Date get_timeEnd() {
		return _timeEnd;
	}
	public void set_timeEnd(Date _timeEnd) {
		this._timeEnd = _timeEnd;
	}
	

}
