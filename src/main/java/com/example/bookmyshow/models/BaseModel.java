package com.example.bookmyshow.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

	@CreatedDate
	@Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;
    
	@LastModifiedDate
	@Temporal(value = TemporalType.TIMESTAMP)
    private Date modifiedAt;
    
}
