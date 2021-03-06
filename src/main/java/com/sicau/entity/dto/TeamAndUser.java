package com.sicau.entity.dto;

public class TeamAndUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teamAndUser.id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    private int id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teamAndUser.team_id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    private String teamId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teamAndUser.captain
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    private String captain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teamAndUser.member
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    private String member;

    public TeamAndUser(String teamId, String captainId, String memberId) {
        this.teamId=teamId;
        this.captain=captainId;
        this.member=memberId;
    }

    public TeamAndUser(String captain, String member) {
        this.captain = captain;
        this.member = member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teamAndUser.id
     *
     * @return the value of teamAndUser.id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public int getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teamAndUser.id
     *
     * @param id the value for teamAndUser.id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teamAndUser.team_id
     *
     * @return the value of teamAndUser.team_id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teamAndUser.team_id
     *
     * @param teamId the value for teamAndUser.team_id
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teamAndUser.captain
     *
     * @return the value of teamAndUser.captain
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public String getCaptain() {
        return captain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teamAndUser.captain
     *
     * @param captain the value for teamAndUser.captain
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public void setCaptain(String captain) {
        this.captain = captain == null ? null : captain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teamAndUser.member
     *
     * @return the value of teamAndUser.member
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public String getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teamAndUser.member
     *
     * @param member the value for teamAndUser.member
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }
}