package com.motoshop.client.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.motoshop.common.entity.setting.Setting;
import com.motoshop.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {

	public List<Setting> findByCategory(SettingCategory category);

}
