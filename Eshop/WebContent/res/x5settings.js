(function ( $, x5engine ) {
	var x = x5engine,
		s = x.settings,
		p = s.currentPath,
		b = x.boot;

	s.islocal = true;
	b.push(function () {
		x.setupDateTime();
		x.imAccess.showLogout();
		x.utils.autoHeight();
		x.cart.ui.updateWidget();
		x.imGrid.init();
	});
	s.menu = {
		verticalScroll: false,
		orientation: 'horizontal'
	};
	b.push(function () {
		x.menu({
			target: '#imMnMn',
			showCurrent: false,
			verticalScroll: false,
			orientation: 'horizontal',
			menuHeight: 62,
			menuWidth: 120,
			submenuHeight: 22,
			submenuWidth: 160,
			opacity: 0.8,
			type: 'singleColumn',
			alignment: 'left',
			effect: 'fade'
		});
	});
	b.push(function () { x.utils.imPreloadImages([p + 'menu/index_h.png',p + 'menu/page-1_h.png',p + 'menu/page-2_h.png',p + 'menu/page-3_h.png', p + 'res/imLoad.gif', p + 'res/imClose.png']); });

	// ShowBox
	$.extend(s.imShowBox, {
		'effect' : 'fade',
		'shadow' : '',
		'background' : '#000000',
		'borderWidth' : {
			'top': 1,
			'right': 1,
			'bottom': 1,
			'left': 1
		},
		'borderRadius' : '5px 5px 5px 5px',
		'borderColor' : '#000000 #000000 #000000 #000000',
		'textColor' : '#000000',
		'fontFamily' : 'Tahoma',
		'fontStyle' : 'normal',
		'fontWeight' : 'normal',
		'fontSize' : '9pt',
		'textAlignment' : 'left',
		'boxColor' : '#FFFFFF',
		'opacity' : 0.7,
		'radialBg' : true // Works only in Mozilla Firefox and Google Chrome
	});

	// PopUp
	$.extend(s.imPopUp, {
		'effect' : 'fade',
		'width' : 500,
		'shadow' : '',
		'background' : '#000000',
		'borderRadius' : 10,
		'textColor' : '#000000',
		'boxColor' : '#FFFFFF',
		'opacity' : 0.7
	});

	// Tip
	$.extend(s.imTip, {
		'borderRadius' : 1,
		'arrow' : true,
		'position' : 'bottom',
		'effect' : 'none',
		'showTail' : true
	});

	// Captcha
	var codes = s.imCaptcha.offlineCodes;
	codes[0] = { letter: 'Y', path: 'captcha/imcpa_4y4.gif'};
	codes[1] = { letter: '4', path: 'captcha/imcpa_pkz.gif'};
	codes[2] = { letter: 'G', path: 'captcha/imcpa_4np.gif'};
	codes[3] = { letter: '6', path: 'captcha/imcpa_a4e.gif'};
	codes[4] = { letter: '8', path: 'captcha/imcpa_tul.gif'};
	codes[5] = { letter: 'A', path: 'captcha/imcpa_dsw.gif'};
	codes[6] = { letter: 'A', path: 'captcha/imcpa_wlw.gif'};
	codes[7] = { letter: 'H', path: 'captcha/imcpa_u6h.gif'};
	codes[8] = { letter: 'F', path: 'captcha/imcpa_vsr.gif'};
	codes[9] = { letter: '7', path: 'captcha/imcpa_prm.gif'};
	s.loaded = true;
})( _jq, x5engine );