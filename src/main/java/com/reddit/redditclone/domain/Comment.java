package com.reddit.redditclone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.reddit.redditclone.Auditable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{
	
	@Id
	@GeneratedValue
	private Long Id;
	private String body;

	//Link
	@ManyToOne
	private Link link;

}
