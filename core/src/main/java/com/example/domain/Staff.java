package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yichuan
 */
@Getter
@Setter
@ToString
@Entity
public class Staff implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "staff_id")
    private Integer staffId;

    private String firstName;

    private String lastName;

    private Short addressId;

    private String email;

    private Byte storeId;

    private Boolean active;

    private String username;

    private String password;

    private Date lastUpdate;

    /**
     * 工作人员的照片，使用了 BLOB属性
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "picture", columnDefinition = "BLOB", nullable = true)
    private byte[] picture;
}
