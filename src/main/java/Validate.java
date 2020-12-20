public class Validate {

    public static void validateLockerID(String lockerID) {
        validateNumeric(lockerID);
        validateLockerIdRange(lockerID);
    }

    public static void validateActionType(String actionType) {
        validateNumeric(actionType);
        validateActionTypeRange(actionType);
    }

    public static void validateMealSelection(String mealSelection) {
        validateNumeric(mealSelection);
        validateMealSelectionRange(mealSelection);
    }

    private static void validateNumeric(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
        }
    }

    private static void validateLockerIdRange(String lockerID) {
        int intLockerID = Integer.parseInt(lockerID);
        if (intLockerID < Sauna.MIN_LOCKER_NUMBER || intLockerID > Sauna.MAX_LOCKER_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 해당 라커 번호는 존재하지 않습니다.");
        }
    }

    private static void validateActionTypeRange(String actionType) {
        int intActionType = Integer.parseInt(actionType);
        if (intActionType < Sauna.MIN_ACTION_NUMBER || intActionType > Sauna.MAX_ACTION_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 선택입니다.");
        }
    }

    private static void validateMealSelectionRange(String mealSelection) {
        int intMealSelection = Integer.parseInt(mealSelection);
        if (intMealSelection < 0 || intMealSelection > Sauna.getMeals().size()) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 메뉴입니다.");
        }
    }

    public static void validateNoDuplicate(String lockerID) {
        if (hasDuplicate(lockerID)) {
            throw new IllegalArgumentException("[ERROR] 이미 등록되어 있는 라커입니다.");
        }
    }

    public static void validateYesDuplicate(String lockerID) {
        if (!hasDuplicate(lockerID)) {
            throw new IllegalArgumentException("[ERROR] 등록되어 있지 않은 라커입니다.");
        }
    }

    private static boolean hasDuplicate(String lockerID) {
        return Sauna.getLockers().stream()
                .map(CustomerContainer::getContainerID)
                .anyMatch(x -> x.equals(lockerID));
    }
}
