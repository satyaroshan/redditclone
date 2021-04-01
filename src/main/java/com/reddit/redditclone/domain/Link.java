package com.reddit.redditclone.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.reddit.redditclone.Auditable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Link extends Auditable{

	@Id
	@GeneratedValue
	private Long Id;
	private String title;
	private String url;
	
	//comments
	@OneToMany(mappedBy="link")
	private List<Comment> comments=new ArrayList<>();

	}
