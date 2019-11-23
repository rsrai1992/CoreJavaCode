package com.infiniteskills.data.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TIME_TEST")
public class TimeTest {
	
	@Id
	@GeneratedValue
	@Column(name="TIME_TEST_ID")
	private long timeTestId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATETIME_COLUMN")
	private Date datetimeColumn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TIMESTAMP_COLUMN")
	private Date timestampColumn;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_COLUMN")
	private Date dateColumn;
	
	@Temporal(TemporalType.TIME)
	@Column(name="TIME_COLUMN")
	private Date timeColumn;
	
	@Column(name="SQL_DATETIME_COLUMN")
	private java.sql.Timestamp sqlDatetimeColumn;
	
	@Column(name="SQL_TIMESTAMP_COLUMN")
	private java.sql.Timestamp sqlTimestampColumn;
	
	@Column(name="SQL_DATE_COLUMN")
	private java.sql.Timestamp sqlDateColumn;
	
	@Column(name="SQL_TIME_COLUMN")
	private Time sqlTimeColumn;
	
	public TimeTest() {
		super();
	}

	public TimeTest(Date date) {
		this.datetimeColumn = date;
		this.timestampColumn = date;
		this.dateColumn = date;
		this.timeColumn = date;
		
		this.sqlDatetimeColumn = new java.sql.Timestamp(date.getTime());
		this.sqlTimestampColumn = new java.sql.Timestamp(date.getTime());
		this.sqlDateColumn = new java.sql.Timestamp(date.getTime());
		this.sqlTimeColumn = new java.sql.Time(date.getTime());
	}
	
	
	public long getTimeTestId() {
		return timeTestId;
	}
	public void setTimeTestId(long timeTestId) {
		this.timeTestId = timeTestId;
	}
	public Date getDatetimeColumn() {
		return datetimeColumn;
	}
	public void setDatetimeColumn(Date datetimeColumn) {
		this.datetimeColumn = datetimeColumn;
	}
	public Date getTimestampColumn() {
		return timestampColumn;
	}
	public void setTimestampColumn(Date timestampColumn) {
		this.timestampColumn = timestampColumn;
	}
	public Date getDateColumn() {
		return dateColumn;
	}
	public void setDateColumn(Date dateColumn) {
		this.dateColumn = dateColumn;
	}
	public Date getTimeColumn() {
		return timeColumn;
	}
	public void setTimeColumn(Date timeColumn) {
		this.timeColumn = timeColumn;
	}
	public java.sql.Timestamp getSqlDatetimeColumn() {
		return sqlDatetimeColumn;
	}
	public void setSqlDatetimeColumn(java.sql.Timestamp sqlDatetimeColumn) {
		this.sqlDatetimeColumn = sqlDatetimeColumn;
	}
	public java.sql.Timestamp getSqlTimestampColumn() {
		return sqlTimestampColumn;
	}
	public void setSqlTimestampColumn(java.sql.Timestamp sqlTimestampColumn) {
		this.sqlTimestampColumn = sqlTimestampColumn;
	}
	public java.sql.Timestamp getSqlDateColumn() {
		return sqlDateColumn;
	}
	public void setSqlDateColumn(java.sql.Timestamp sqlDateColumn) {
		this.sqlDateColumn = sqlDateColumn;
	}
	public Time getSqlTimeColumn() {
		return sqlTimeColumn;
	}
	public void setSqlTimeColumn(Time sqlTimeColumn) {
		this.sqlTimeColumn = sqlTimeColumn;
	}
}
