

# TransactionSearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acquirerRefNumber** | **String** | CONDITIONAL: Acquirer Reference Number. If provided bankNetRefNumber may not be used. This field is required and applicable if primaryAccountNum is not provided.   Length: 23   Valid Values/Format: Numeric |  [optional]
**bankNetRefNumber** | **String** | CONDITIONAL: This field is comprised of the Financial Network Code + Banknet Reference Number. If provided, must provide PAN in primaryAccountNum parameter. If provided, cannot use acquirerRefNumber parameter.  Length: 9  Valid Values/Format: Alphanumeric |  [optional]
**primaryAccountNum** | **String** | CONDITIONAL: Primary Account Number. This field is required and applicable if acquirerRefNum is not provided.   Length: 11-19   Valid Values/Format: Numeric |  [optional]
**transAmountFrom** | **String** | Transaction amount lower limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric |  [optional]
**transAmountTo** | **String** | Transaction amount upper limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric |  [optional]
**tranStartDate** | **String** | Transaction Date min search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) | 
**tranEndDate** | **String** | Transaction Date max search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd) | 



