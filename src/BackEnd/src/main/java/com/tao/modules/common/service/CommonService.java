package com.tao.modules.common.service;

import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.SimpleMap;

/**
 * 公共服务接口
 */
public interface CommonService {
    boolean exist(SimpleMap map);

    GridPage list(SimpleMap map);

    SimpleMap getOne(SimpleMap map);

    void saveData(SimpleMap map);

    void updateDate(SimpleMap map);

}
