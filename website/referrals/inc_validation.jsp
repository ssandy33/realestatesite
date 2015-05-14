<script language="javascript">

	function ValidationErrors() {
	
		this.formFieldIds = new Array();
		this.prevFormFieldIds = new Array();
		this.messages = new Array();
		
		this.reset = function() {
			this.prevFormFieldIds = this.formFieldIds;
			this.formFieldIds = new Array();
			this.messages = new Array();
		}
		
		this.add = function (fieldId, msg) {
			this.formFieldIds[this.formFieldIds.length] = fieldId;
			this.messages[this.messages.length] = msg;
		}
		
		this.buildAlertMsg = function(lineTerm) {
			var alertMsg = "";
			var n = this.messages.length;
			for (var i = 0; i < n; i++) {
				alertMsg += this.messages[i];
				if (i < n - 1) {
					alertMsg += lineTerm;
				}
			}
			return alertMsg;
		}
		
		this.hasError = function() {
			return this.messages.length > 0;
		}
		
		this.hilightErrorFields = function(form, hilightColor, lolightColor) {
		
			// Lowlight the previous error fields.
			changeFieldBorderColor(form, this.prevFormFieldIds, lolightColor);
			
			// Highlight the new error fields.
			changeFieldBorderColor(form, this.formFieldIds, hilightColor);
		}
	}
	
	function changeFieldBorderColor(form, fieldIds, borderColor) {
		for (var i = 0; i < fieldIds.length; i++) {
			var formField = form[fieldIds[i]];
			if (formField !== undefined)
				formField.style.borderColor = borderColor;
		}
	} 

	var validationErrors = new ValidationErrors();

	function Validation(oForm) {
	
		if (!oForm["cell1"].value)
		{
			validationErrors.add("cell1", "Contact phone is required");
		}
		else
		{
			if (oForm["cell1"].value.length != 3)
				validationErrors.add("cell1", "Contact phone is required");
		}
	
		if (!oForm["cell2"].value)
		{
			validationErrors.add("cell2", "Contact phone is required");
		}
		else
		{
			if (oForm["cell2"].value.length != 3)
				validationErrors.add("cell2", "Contact phone is required");
		}
	
		if (!oForm["cell3"].value)
		{
			validationErrors.add("cell3", "Contact phone is required");
		}
		else
		{
			if (oForm["cell3"].value.length != 4)
				validationErrors.add("cell3", "Contact phone is required");
		}
	
		if (!oForm["firstName"].value)
		{
			validationErrors.add("firstName", "Firstname is required");
		}
	
		if (!oForm["lastName"].value)
		{
			validationErrors.add("lastName", "Lastname is required");
		}
		
		// if (!oForm["email"].value)
		// {
		// 	validationErrors.add("email", "Email address is required");
		// }
		
		// if (!oForm["confirmEmail"].value)
		// {
		// 	validationErrors.add("confirmEmail", "Please confirm your email address");
		// }
		
		// if (oForm["email"].value && oForm["confirmEmail"].value)
		// {
		// 	if (oForm["email"].value !== oForm["confirmEmail"].value)
		// 	{
		// 		validationErrors.add("confirmEmail", "email addresses must match");
		// 		validationErrors.add("email", "email addresses must match");	
		// 	}
		// }
		
		
		if (validationErrors.hasError())
		{
			// Report validation errors by showing them in a div highlighting the
			// form fields containing missing required or invalid fields.
			//document.getElementById("validationErrors").style.display = "block";
			//alertMsg = validationErrors.buildAlertMsg("<br/>");
			//oErrorDiv.innerHTML = alertMsg;
			validationErrors.hilightErrorFields(oForm, "#ff0000", "");
			window.scrollTo(0, 0);
			validationErrors.reset();
			return false;
		}
	
		if (!validationErrors.hasError())
		{
			return true;
		}
	
	}

</script>