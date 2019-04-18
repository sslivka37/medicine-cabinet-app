package org.wecancodeit.medicinecabinetapp.validator;

import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.service.UserService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{
	
	@Autowired
	private UserService userService;

	 @Override
	    public boolean supports(Class<?> aClass) {
	        return User.class.equals(aClass);
	    }

	    @Override
	    public void validate(Object o, Errors errors) {
	        User user = (User) o;

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty");
	        if (user.getUserName().length() < 6 || user.getUserName().length() > 32) {
	            errors.rejectValue("userName", "Size.userForm.userName");
	        }
	        if (userService.findByUsername(user.getUserName()) != null) {
	            errors.rejectValue("userName", "Duplicate.userForm.userName");
	        }

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPassword", "NotEmpty");
	        if (user.getUserPassword().length() < 8 || user.getUserPassword().length() > 32) {
	            errors.rejectValue("userPassword", "Size.userForm.userPassword");
	        }

	        if (!user.getPasswordConfirm().equals(user.getUserPassword())) {
	            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
	        }
	    }
	
}
