package com.ys.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

	private static Logger logger = Logger.getLogger(PageController.class);

	
	@RequestMapping("/")
    public String helloHtml(){
		
        return"/index";
    }


	@RequestMapping(value = "/page01", method = RequestMethod.GET)
	public String page01() {
		logger.info("表单page01");
		return  "page01";
	}

	@RequestMapping(value = "/page02", method = RequestMethod.GET)
	public String page02() {
		logger.info("表单page02");
		return  "page02";
	}

	@RequestMapping(value = "/page03", method = RequestMethod.GET)
	public String page03() {
		logger.info("表单page03");
		return  "page03";
	}

	@RequestMapping(value = "/page04", method = RequestMethod.GET)
	public String page04() {
		logger.info("表单page04");
		return  "page04";
	}

	@RequestMapping(value = "/page05", method = RequestMethod.GET)
	public String page05() {
		logger.info("表单page05");
		return  "page05";
	}

	@RequestMapping(value = "/page06", method = RequestMethod.GET)
	public String page06() {
		logger.info("表单page06");
		return  "page06";
	}

	@RequestMapping(value = "/page07", method = RequestMethod.GET)
	public String page07() {
		logger.info("表单page07");
		return  "page07";
	}

	@RequestMapping(value = "/page08", method = RequestMethod.GET)
	public String page08() {
		logger.info("表单page08");
		return  "page08";
	}

	@RequestMapping(value = "/page09", method = RequestMethod.GET)
	public String page09() {
		logger.info("表单page09");
		return  "page09";
	}

	@RequestMapping(value = "/page10", method = RequestMethod.GET)
	public String page10() {
		logger.info("表单page10");
		return  "page10";
	}

	@RequestMapping(value = "/page11", method = RequestMethod.GET)
	public String page11() {
		logger.info("表单page11");
		return  "page11";
	}

	@RequestMapping(value = "/page12", method = RequestMethod.GET)
	public String page12() {
		logger.info("表单page12");
		return  "page12";
	}

	@RequestMapping(value = "/page13", method = RequestMethod.GET)
	public String page13() {
		logger.info("表单page13");
		return  "page13";
	}

	@RequestMapping(value = "/page14", method = RequestMethod.GET)
	public String page14() {
		logger.info("表单page14");
		return  "page14";
	}

	@RequestMapping(value = "/page15", method = RequestMethod.GET)
	public String page15() {
		logger.info("表单page15");
		return  "page15";
	}

	@RequestMapping(value = "/page16", method = RequestMethod.GET)
	public String page16() {
		logger.info("表单page16");
		return  "page16";
	}

	@RequestMapping(value = "/page17", method = RequestMethod.GET)
	public String page17() {
		logger.info("表单page17");
		return  "page17";
	}

	@RequestMapping(value = "/page18", method = RequestMethod.GET)
	public String page18() {
		logger.info("表单page18");
		return  "page18";
	}

	@RequestMapping(value = "/page19", method = RequestMethod.GET)
	public String page19() {
		logger.info("表单page19");
		return  "page19";
	}

	@RequestMapping(value = "/page20", method = RequestMethod.GET)
	public String page20() {
		logger.info("表单page20");
		return  "page20";
	}

	@RequestMapping(value = "/page21", method = RequestMethod.GET)
	public String page21() {
		logger.info("表单page21");
		return  "page21";
	}

	@RequestMapping(value = "/page22", method = RequestMethod.GET)
	public String page22() {
		logger.info("表单page22");
		return  "page22";
	}

	@RequestMapping(value = "/page23", method = RequestMethod.GET)
	public String page23() {
		logger.info("表单page23");
		return  "page23";
	}

	@RequestMapping(value = "/page24", method = RequestMethod.GET)
	public String page24() {
		logger.info("表单page24");
		return  "page24";
	}

	@RequestMapping(value = "/page25", method = RequestMethod.GET)
	public String page25() {
		logger.info("表单page25");
		return  "page25";
	}

	@RequestMapping(value = "/page26", method = RequestMethod.GET)
	public String page26() {
		logger.info("表单page26");
		return  "page26";
	}

	@RequestMapping(value = "/page27", method = RequestMethod.GET)
	public String page27() {
		logger.info("表单page27");
		return  "page27";
	}

	@RequestMapping(value = "/page28", method = RequestMethod.GET)
	public String page28() {
		logger.info("表单page28");
		return  "page28";
	}

	@RequestMapping(value = "/page29", method = RequestMethod.GET)
	public String page29() {
		logger.info("表单page29");
		return  "page29";
	}

	@RequestMapping(value = "/page30", method = RequestMethod.GET)
	public String page30() {
		logger.info("表单page30");
		return  "page30";
	}

	@RequestMapping(value = "/page31", method = RequestMethod.GET)
	public String page31() {
		logger.info("表单page31");
		return  "page31";
	}

	@RequestMapping(value = "/page32", method = RequestMethod.GET)
	public String page32() {
		logger.info("表单page32");
		return  "page32";
	}

	@RequestMapping(value = "/page33", method = RequestMethod.GET)
	public String page33() {
		logger.info("表单page33");
		return  "page33";
	}

	@RequestMapping(value = "/page34", method = RequestMethod.GET)
	public String page34() {
		logger.info("表单page34");
		return  "page34";
	}

	@RequestMapping(value = "/page35", method = RequestMethod.GET)
	public String page35() {
		logger.info("表单page35");
		return  "page35";
	}

	@RequestMapping(value = "/page36", method = RequestMethod.GET)
	public String page36() {
		logger.info("表单page36");
		return  "page36";
	}

	@RequestMapping(value = "/page37", method = RequestMethod.GET)
	public String page37() {
		logger.info("表单page37");
		return  "page37";
	}

	@RequestMapping(value = "/page38", method = RequestMethod.GET)
	public String page38() {
		logger.info("表单page38");
		return  "page38";
	}

	@RequestMapping(value = "/page39", method = RequestMethod.GET)
	public String page39() {
		logger.info("表单page39");
		return  "page39";
	}

	@RequestMapping(value = "/page40", method = RequestMethod.GET)
	public String page40() {
		logger.info("表单page40");
		return  "page40";
	}

	@RequestMapping(value = "/page41", method = RequestMethod.GET)
	public String page41() {
		logger.info("表单page41");
		return  "page41";
	}

	@RequestMapping(value = "/page42", method = RequestMethod.GET)
	public String page42() {
		logger.info("表单page42");
		return  "page42";
	}

	@RequestMapping(value = "/page43", method = RequestMethod.GET)
	public String page43() {
		logger.info("表单page43");
		return  "page43";
	}

	@RequestMapping(value = "/page44", method = RequestMethod.GET)
	public String page44() {
		logger.info("表单page44");
		return  "page44";
	}

	@RequestMapping(value = "/page45", method = RequestMethod.GET)
	public String page45() {
		logger.info("表单page45");
		return  "page45";
	}

	@RequestMapping(value = "/page46", method = RequestMethod.GET)
	public String page46() {
		logger.info("表单page46");
		return  "page46";
	}

	@RequestMapping(value = "/page47", method = RequestMethod.GET)
	public String page47() {
		logger.info("表单page47");
		return  "page47";
	}

	@RequestMapping(value = "/page48", method = RequestMethod.GET)
	public String page48() {
		logger.info("表单page48");
		return  "page48";
	}

	@RequestMapping(value = "/page49", method = RequestMethod.GET)
	public String page49() {
		logger.info("表单page49");
		return  "page49";
	}

	@RequestMapping(value = "/page50", method = RequestMethod.GET)
	public String page50() {
		logger.info("表单page50");
		return  "page50";
	}

	@RequestMapping(value = "/page51", method = RequestMethod.GET)
	public String page51() {
		logger.info("表单page51");
		return  "page51";
	}

	@RequestMapping(value = "/page52", method = RequestMethod.GET)
	public String page52() {
		logger.info("表单page52");
		return  "page52";
	}

	@RequestMapping(value = "/page53", method = RequestMethod.GET)
	public String page53() {
		logger.info("表单page53");
		return  "page53";
	}

	@RequestMapping(value = "/page54", method = RequestMethod.GET)
	public String page54() {
		logger.info("表单page54");
		return  "page54";
	}

	@RequestMapping(value = "/page55", method = RequestMethod.GET)
	public String page55() {
		logger.info("表单page55");
		return  "page55";
	}

	@RequestMapping(value = "/page56", method = RequestMethod.GET)
	public String page56() {
		logger.info("表单page42");
		return  "page42";
	}

	@RequestMapping(value = "/page57", method = RequestMethod.GET)
	public String page57() {
		logger.info("表单page57");
		return  "page57";
	}

	@RequestMapping(value = "/page58", method = RequestMethod.GET)
	public String page58() {
		logger.info("表单page58");
		return  "page58";
	}

	@RequestMapping(value = "/page59", method = RequestMethod.GET)
	public String page59() {
		logger.info("表单page59");
		return  "page59";
	}

	@RequestMapping(value = "/page60", method = RequestMethod.GET)
	public String page60() {
		logger.info("表单page60");
		return  "page60";
	}

	@RequestMapping(value = "/page61", method = RequestMethod.GET)
	public String page61() {
		logger.info("表单page61");
		return  "page61";
	}

	@RequestMapping(value = "/page62", method = RequestMethod.GET)
	public String page62() {
		logger.info("表单page62");
		return  "page62";
	}

	@RequestMapping(value = "/page63", method = RequestMethod.GET)
	public String page63() {
		logger.info("表单page63");
		return  "page63";
	}

	@RequestMapping(value = "/page64", method = RequestMethod.GET)
	public String page64() {
		logger.info("表单page64");
		return  "page64";
	}

	@RequestMapping(value = "/page65", method = RequestMethod.GET)
	public String page65() {
		logger.info("表单page65");
		return  "page65";
	}

	@RequestMapping(value = "/page66", method = RequestMethod.GET)
	public String page66() {
		logger.info("表单page66");
		return  "page66";
	}

	@RequestMapping(value = "/page67", method = RequestMethod.GET)
	public String page67() {
		logger.info("表单page67");
		return  "page67";
	}

	@RequestMapping(value = "/page68", method = RequestMethod.GET)
	public String page68() {
		logger.info("表单page68");
		return  "page68";
	}

	@RequestMapping(value = "/page69", method = RequestMethod.GET)
	public String page69() {
		logger.info("表单page69");
		return  "page69";
	}

	@RequestMapping(value = "/page70", method = RequestMethod.GET)
	public String page70() {
		logger.info("表单page70");
		return  "page70";
	}

	@RequestMapping(value = "/page71", method = RequestMethod.GET)
	public String page71() {
		logger.info("表单page71");
		return  "page71";
	}

	@RequestMapping(value = "/page72", method = RequestMethod.GET)
	public String page72() {
		logger.info("表单page72");
		return  "page72";
	}

	@RequestMapping(value = "/page73", method = RequestMethod.GET)
	public String page73() {
		logger.info("表单page73");
		return  "page73";
	}

	@RequestMapping(value = "/page74", method = RequestMethod.GET)
	public String page74() {
		logger.info("表单page74");
		return  "page74";
	}

	@RequestMapping(value = "/page75", method = RequestMethod.GET)
	public String page75() {
		logger.info("表单page75");
		return  "page75";
	}

	@RequestMapping(value = "/page76", method = RequestMethod.GET)
	public String page76() {
		logger.info("表单page76");
		return  "page76";
	}

	@RequestMapping(value = "/page77", method = RequestMethod.GET)
	public String page77() {
		logger.info("表单page77");
		return  "page77";
	}

	@RequestMapping(value = "/page78", method = RequestMethod.GET)
	public String page78() {
		logger.info("表单page78");
		return  "page78";
	}

	@RequestMapping(value = "/page79", method = RequestMethod.GET)
	public String page79() {
		logger.info("表单page79");
		return  "page79";
	}

	@RequestMapping(value = "/page80", method = RequestMethod.GET)
	public String page80() {
		logger.info("表单page80");
		return  "page80";
	}

	@RequestMapping(value = "/page81", method = RequestMethod.GET)
	public String page81() {
		logger.info("表单page81");
		return  "page81";
	}

	@RequestMapping(value = "/page82", method = RequestMethod.GET)
	public String page82() {
		logger.info("表单page82");
		return  "page82";
	}

	@RequestMapping(value = "/page83", method = RequestMethod.GET)
	public String page83() {
		logger.info("表单page83");
		return  "page83";
	}

	@RequestMapping(value = "/page84", method = RequestMethod.GET)
	public String page84() {
		logger.info("表单page84");
		return  "page84";
	}

	@RequestMapping(value = "/page85", method = RequestMethod.GET)
	public String page85() {
		logger.info("表单page85");
		return  "page85";
	}

	@RequestMapping(value = "/page86", method = RequestMethod.GET)
	public String page86() {
		logger.info("表单page86");
		return  "page86";
	}

	@RequestMapping(value = "/page87", method = RequestMethod.GET)
	public String page87() {
		logger.info("表单page87");
		return  "page87";
	}

	@RequestMapping(value = "/page88", method = RequestMethod.GET)
	public String page88() {
		logger.info("表单page88");
		return  "page88";
	}

	@RequestMapping(value = "/page89", method = RequestMethod.GET)
	public String page89() {
		logger.info("表单page89");
		return  "page89";
	}

	@RequestMapping(value = "/page90", method = RequestMethod.GET)
	public String page90() {
		logger.info("表单page90");
		return  "page90";
	}

	@RequestMapping(value = "/page91", method = RequestMethod.GET)
	public String page91() {
		logger.info("表单page91");
		return  "page91";
	}

	@RequestMapping(value = "/page92", method = RequestMethod.GET)
	public String page92() {
		logger.info("表单page92");
		return  "page92";
	}

}
