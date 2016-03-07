package org.yocto.crops.zephyr;

import java.util.HashMap;
import java.util.Map;

public class ZephyrConstants {
	/* TODO handle these a different way? */
	private static final String ZEPHYR_SDK_VERSION = "0.7.2";
	private static final String ZEPHYR_GIT_REPO = "http://github.com/crops:8888/todor/zephyr.git";
	private static final String ZEPHYR_GIT_BRANCH = "v0.8.0-ln-s";
	private static final String ZEPHYR_PROJECT = "zephyr-project";
	
	public static class Boards {
	/* zephyr-project/boards */
		public String getBoard(board_id id) {
			return getBoards().get(id);
		}
		
		/* Assuming we want nicer names we would use this Map */
		public Map<board_id, String> getBoards() {
			Map<board_id, String> map = new HashMap<>();
			map.put(board_id.arduino_101, "arduino_101");
			map.put(board_id.arduino_101_sss, "arduino_101_sss");
			map.put(board_id.basic_cortex_m3, "basic_cortex_m3");
			map.put(board_id.basic_minuteia, "basic_minuteia");
			map.put(board_id.frdm_k64f, "frdm_k64f");
			map.put(board_id.galileo, "galileo");
			map.put(board_id.minnowboard, "minnowboard");
			map.put(board_id.qemu_cortex_m3, "qemu_cortex_m3");
			map.put(board_id.qemu_x86, "qemu_x86");
			map.put(board_id.quark_d2000_crb, "quark_d2000_crb");
			map.put(board_id.quark_se_ctb, "quark_se_ctb");
			map.put(board_id.quark_se_sss_ctb, "quark_se_sss_ctb");
			return map;
		}
			
		/* TODO: pull these from JSON file provided by toolchain container */
		public enum board_id {
			arduino_101,
			arduino_101_sss,
			basic_cortex_m3,
			basic_minuteia,
			frdm_k64f,
			galileo,
			minnowboard,
			qemu_cortex_m3,
			qemu_x86,
			quark_d2000_crb,
			quark_se_ctb,
			quark_se_sss_ctb
		}
	}

	/* zephyr-project/arch */
	enum Arch {
	arc,
	arm,
	x86
	}

	/* zephyr-project/arch/arc/soc */
	enum Arch_arc {
	generic_arc,
	quark_se_ss
	}

	/* zephyr-project/arch/arm/soc */
	enum Arch_arm {
	fsl_frdm_k64f,
	ti_lm3s6965
	}

	/* zephyr-project/arch/x86/soc */
	enum Arch_x86 {
	atom,
	ia32,
	ia32_pci,
	quark_d2000,
	quark_se,
	quark_x1000
	}


}
