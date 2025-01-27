package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.BaojianyuyDao;
import com.entity.BaojianyuyEntity;
import com.service.BaojianyuyService;
import com.entity.view.BaojianyuyView;

/**
 * 包间预约表 服务实现类
 * @author 
 * @since 2021-02-19
 */
@Service("baojianyuyService")
@Transactional
public class BaojianyuyServiceImpl extends ServiceImpl<BaojianyuyDao, BaojianyuyEntity> implements BaojianyuyService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BaojianyuyView> page =new Query<BaojianyuyView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
