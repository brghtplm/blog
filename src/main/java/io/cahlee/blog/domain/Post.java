package io.cahlee.blog.domain;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String writer;
	private String contents;
	private Date createdDate;
	private Date modifiedDate;
}
