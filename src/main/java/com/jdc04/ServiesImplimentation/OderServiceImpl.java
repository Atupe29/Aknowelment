package com.jdc04.ServiesImplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.OderHeader;
import com.jdc04.Repositry.Oderheaderrepo;
import com.jdc04.Service.OderheaderService;

@Service
public class OderServiceImpl implements OderheaderService {
	@Autowired
	private Oderheaderrepo oderRepo;

	@Override
	public OderHeader Addoder(OderHeader oderHeader) {
		oderRepo.save(oderHeader);
		return null;
	}
}
