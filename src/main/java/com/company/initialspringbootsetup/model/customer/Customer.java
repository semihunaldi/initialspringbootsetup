package com.company.initialspringbootsetup.model.customer;

import com.company.initialspringbootsetup.model.SimpleAbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 */

@Entity
@Data
@Table(name = "T_CUSTOMER",  uniqueConstraints = {@UniqueConstraint(name = "T_CUSTOMER_EMAIL_UNIQUE",columnNames = "email")})
@DynamicUpdate
@EqualsAndHashCode(callSuper = true)
@Where(clause = "DELETED = '0'")
public class Customer extends SimpleAbstractEntity
{
    private String firstName;

    private String lastName;

    private String email;

    private String mobilePhone;
}
