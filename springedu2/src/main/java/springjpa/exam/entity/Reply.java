package springjpa.exam.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String content;
	@ManyToOne( optional = false )
	@JoinColumn(name="refid") // 이게 없으면 디비테이블 컬럼명이 refid_refid로 설정되버림
	private Meeting refid;
}
