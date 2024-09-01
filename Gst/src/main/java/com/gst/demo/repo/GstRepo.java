package com.gst.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.demo.entity.Gst;

public interface GstRepo extends JpaRepository<Gst, Integer>{
	@Query(value = "select percentage from gst where hsn = ? ",nativeQuery = true)

	int getPercentage(int hsn);

}
