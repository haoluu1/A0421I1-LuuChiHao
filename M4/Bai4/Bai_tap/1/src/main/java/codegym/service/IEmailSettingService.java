package codegym.service;

import codegym.entity.EmailSetting;

import java.util.List;

public interface IEmailSettingService {
    List<EmailSetting> findAll();
    EmailSetting finById(int id);
    void save(EmailSetting emailSetting);
}
