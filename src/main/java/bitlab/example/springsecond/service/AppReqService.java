package bitlab.example.springsecond.service;

import bitlab.example.springsecond.model.ApplicationRequest;
import bitlab.example.springsecond.repository.AppReqRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Transactional
public class AppReqService {
    @Autowired
    private AppReqRepository appReqRepository;

    public List<ApplicationRequest> getAppReq(){
        return appReqRepository.findAll();
    }

    public void addAppReq(ApplicationRequest applicationRequest){
        applicationRequest.setHandled(false);
        appReqRepository.save(applicationRequest);
    }

    public ApplicationRequest getAppReqById(Long id){
        return appReqRepository.findById(id).orElse(null);
    }

    public void deleteAppReq(Long id){
        appReqRepository.deleteById(id);
    }

    public void editAppReq(ApplicationRequest applicationRequest) {
        applicationRequest.setHandled(true);
        appReqRepository.save(applicationRequest);
    }
}
