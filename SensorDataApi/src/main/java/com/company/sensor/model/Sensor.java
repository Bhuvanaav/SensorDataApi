package com.company.sensor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sensor extends Auditable{
    @Id
    @GeneratedValue
    private Integer alertId;
    private Integer sensorId;
    private String operator;
    private Integer value;
    private String person_name;
    private String phoneNo;
    private boolean status;

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(Integer alertId) {
        this.alertId = alertId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Sensor(Integer alertId, Integer sensorId, String operator, Integer value, String person_name, String phoneNo, boolean status) {
        this.alertId = alertId;
        this.sensorId = sensorId;
        this.operator = operator;
        this.value = value;
        this.person_name = person_name;
        this.phoneNo = phoneNo;
        this.status = status;
    }

    public Sensor() {
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "alertId=" + alertId +
                ", sensorId=" + sensorId +
                ", operator='" + operator + '\'' +
                ", value=" + value +
                ", person_name='" + person_name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", status=" + status +
                '}';
    }
}
