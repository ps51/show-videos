package com.show.admin.scetc.mapper;

import java.util.List;

import com.show.admin.scetc.pojo.Bgm;
import com.show.admin.scetc.utils.MyMapper;

public interface BgmMapper extends MyMapper<Bgm> {

	/**
	 * 查询全部的背景音乐
	 * 
	 * @param keyword
	 * @return
	 */
	List<Bgm> queryAll(String keyword);

	/**
	 * 根据名称查询出指定的背景音乐列表
	 * 
	 * @param name
	 * @return
	 */
	List<Bgm> selectBgmByName(String name);

}
