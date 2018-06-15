package com.imooc.entity;

public class Student {
    /**  */
    private Integer id;

    /**  */
    private String name;

    /**  */
    private Integer age;

    /**  */
    private Integer score;

    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", score=" + score + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}