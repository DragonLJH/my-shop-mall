package com.dragon.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.demo.common.Rotation;
import com.dragon.demo.mapper.RotationMapper;

@Service("RotationService")
public class RotationServiceImpl extends ServiceImpl<RotationMapper, Rotation>{

	public List<Rotation> queryAllRotation(){
		return super.list();
	};

}
