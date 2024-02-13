package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="tutorials")
public class Tutorial {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;

	  @Column(length = 128, nullable = false)
	  private String title;

	  @Column(length = 256)
	  private String description;

	  @Column(nullable = false)
	  private int level;

	  @Column
	  private boolean published;

	  public Tutorial() {

	  }

	  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Tutorial(String title, String description, int level, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.level = level;
	    this.published = published;
	  }

}
