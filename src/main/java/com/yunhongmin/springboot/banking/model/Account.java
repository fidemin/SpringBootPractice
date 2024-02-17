package com.yunhongmin.springboot.banking.model;

import com.yunhongmin.springboot.common.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Version
    @Column(nullable = false)
    Integer version;

    @Column(name = "user_id", nullable = false)
    Integer userId;

    @Column(name = "account_number", nullable = false)
    String accountNumber;

    @Column(nullable = false)
    Integer balance;
}
