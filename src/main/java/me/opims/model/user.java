package me.opims.model;

public class user {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id_user
     *
     * @mbggenerated
     */
    private Integer idUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name_user
     *
     * @mbggenerated
     */
    private String nameUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name_real
     *
     * @mbggenerated
     */
    private String nameReal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mail
     *
     * @mbggenerated
     */
    private String mail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated
     */
    private Integer phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.zhanghao
     *
     * @mbggenerated
     */
    private String zhanghao;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.category
     *
     * @mbggenerated
     */
    private Integer category;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id_user
     *
     * @return the value of user.id_user
     *
     * @mbggenerated
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id_user
     *
     * @param idUser the value for user.id_user
     *
     * @mbggenerated
     */
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name_user
     *
     * @return the value of user.name_user
     *
     * @mbggenerated
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name_user
     *
     * @param nameUser the value for user.name_user
     *
     * @mbggenerated
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser == null ? null : nameUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name_real
     *
     * @return the value of user.name_real
     *
     * @mbggenerated
     */
    public String getNameReal() {
        return nameReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name_real
     *
     * @param nameReal the value for user.name_real
     *
     * @mbggenerated
     */
    public void setNameReal(String nameReal) {
        this.nameReal = nameReal == null ? null : nameReal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mail
     *
     * @return the value of user.mail
     *
     * @mbggenerated
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mail
     *
     * @param mail the value for user.mail
     *
     * @mbggenerated
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.zhanghao
     *
     * @return the value of user.zhanghao
     *
     * @mbggenerated
     */
    public String getZhanghao() {
        return zhanghao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.zhanghao
     *
     * @param zhanghao the value for user.zhanghao
     *
     * @mbggenerated
     */
    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.category
     *
     * @return the value of user.category
     *
     * @mbggenerated
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.category
     *
     * @param category the value for user.category
     *
     * @mbggenerated
     */
    public void setCategory(Integer category) {
        this.category = category;
    }
}