package com.reddit.redditclone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Link {

	@Id
	@GeneratedValue
	private Long Id;
	private String title;
	private String url;

	}