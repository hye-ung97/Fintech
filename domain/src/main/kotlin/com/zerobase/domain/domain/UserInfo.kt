package com.zerobase.domain.domain;

import javax.persistence.*;

@Entity
@Table(name = "USER_INFO")
public class UserInfo(
        @Column(name = "usr_key")
        val userKey: String,

        @Column(name = "usr_reg_num")
        val userRegistrationNumber: String,

        @Column(name = "usr_nm")
        val userName: String,

        @Column(name = "usr_icm_ant")
        val userIncomeAmount: Long

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}
