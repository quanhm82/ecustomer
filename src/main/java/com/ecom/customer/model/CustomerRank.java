package com.ecom.customer.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author quanhoang
 * Customer rank as a resource
 */
@Entity
public class CustomerRank {
	
	@Id
	@Column(name = "RANK_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID rankId;
	
	@Column(name = "RANK_NAME")
	private String rankName;
	
	@Column(name = "RANK_LEVEL")
	private int rankLevel;

	public UUID getRankId() {
		return rankId;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public int getRankLevel() {
		return rankLevel;
	}

	public void setRankLevel(int rankLevel) {
		this.rankLevel = rankLevel;
	}
	
}
