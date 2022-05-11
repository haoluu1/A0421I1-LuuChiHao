package codegym.service;

import codegym.entity.EmailSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSettingService implements IEmailSettingService {
    private static Map<Integer,EmailSetting> map=new HashMap<>();
    static {
        map.put(1,new EmailSetting(1,"English",25,true,"Thor"));
    }
    @Override
    public List<EmailSetting> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public EmailSetting finById(int id) {
        return map.get(id);
    }

    @Override
    public void save(EmailSetting emailSetting) {
        map.put(emailSetting.getId(),emailSetting);
    }
}
