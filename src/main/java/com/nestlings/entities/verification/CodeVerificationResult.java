package com.nestlings.entities.verification;

/**
 * Created by mclau on 12/26/2016.
 */
public class CodeVerificationResult {

    private boolean valid;
    private String message;
    private boolean claimFlow;

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public boolean isClaimFlow() {
		return claimFlow;
	}

	public void setClaimFlow(boolean claimFlow) {
		this.claimFlow = claimFlow;
	}

    
}
