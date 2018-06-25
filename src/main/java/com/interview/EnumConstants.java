package com.interview;

public class EnumConstants {

	public static enum Prefix {

		MR("Mr."), MRS("Mrs."), MISS("Miss");

		private final String displayName;

		Prefix(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}
	}

	public static enum Suffix {

		SR("Sr."), JN("Jn."), MISS("Miss");

		private final String displayName;

		Suffix(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}
	}

	public static enum Track {

		JAVA("Java"), NET(".Net"), SQL("Sql");

		private final String displayName;

		Track(String displayName) {
			this.displayName = displayName;
		}

		public String getDisplayName() {
			return displayName;
		}
	}
}
