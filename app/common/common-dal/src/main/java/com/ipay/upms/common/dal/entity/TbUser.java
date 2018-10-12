package com.ipay.upms.common.dal.entity;

import java.util.Date;

public class TbUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.username
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.password
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.phone
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.email
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.sex
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.address
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.state
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.description
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.role_id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.file
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.created
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.updated
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.username
     *
     * @return the value of tb_user.username
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.username
     *
     * @param username the value for tb_user.username
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.phone
     *
     * @return the value of tb_user.phone
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.phone
     *
     * @param phone the value for tb_user.phone
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.email
     *
     * @return the value of tb_user.email
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.email
     *
     * @param email the value for tb_user.email
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.sex
     *
     * @return the value of tb_user.sex
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.sex
     *
     * @param sex the value for tb_user.sex
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.address
     *
     * @return the value of tb_user.address
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.address
     *
     * @param address the value for tb_user.address
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.state
     *
     * @return the value of tb_user.state
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.state
     *
     * @param state the value for tb_user.state
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.description
     *
     * @return the value of tb_user.description
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.description
     *
     * @param description the value for tb_user.description
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.role_id
     *
     * @return the value of tb_user.role_id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.role_id
     *
     * @param roleId the value for tb_user.role_id
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.file
     *
     * @return the value of tb_user.file
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.file
     *
     * @param file the value for tb_user.file
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.created
     *
     * @return the value of tb_user.created
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.created
     *
     * @param created the value for tb_user.created
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.updated
     *
     * @return the value of tb_user.updated
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.updated
     *
     * @param updated the value for tb_user.updated
     *
     * @mbg.generated Thu Oct 11 23:21:10 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}