USE [customer]
GO

/****** Object:  StoredProcedure [dbo].[ovs_XssErrorLogInsert]    Script Date: 01/20/2014 08:55:18 ******/
SET ANSI_NULLS OFF
GO

SET QUOTED_IDENTIFIER OFF
GO


CREATE proc [dbo].[ovs_XssErrorLogInsert]
	
	@cobrand_recno int,
	@query_string varchar(2000),
	@url varchar(2000)

as

--Insert the record into the table
insert into xss_error_log(cobrand_recno, query_string, url, editeddate)
values (@cobrand_recno, @query_string, @url, getdate())


